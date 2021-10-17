package com.fastcampuus.getinline.controller.api;

import com.fastcampuus.getinline.constant.PlaceType;
import com.fastcampuus.getinline.dto.APIDataResponse;
import com.fastcampuus.getinline.dto.PlaceRequest;
import com.fastcampuus.getinline.dto.PlaceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class APIPlaceController {

    @GetMapping("/places")
    public APIDataResponse<List<PlaceResponse>> getPlaces() {
        return APIDataResponse.of(List.of(PlaceResponse.of(
                PlaceType.COMMON,
                "랄라배드민턴장",
                "서울시 강남구 강남대로",
                "010-1234-5678",
                30,
                "신장개업"
        )));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/places")
    public APIDataResponse<Void> createPlace(@RequestBody PlaceRequest placeRequest) {
        return APIDataResponse.empty();
    }

    @GetMapping("/places/{placeId}")
    public APIDataResponse<PlaceResponse> getPlace(@PathVariable Integer placeId) {
        if (placeId.equals(2)) {
            return APIDataResponse.of(null);
        }

        return APIDataResponse.of(PlaceResponse.of(
                PlaceType.COMMON,
                "랄라배드민턴장",
                "서울시 강남구 강남대로",
                "010-1234-5678",
                30,
                "신장개업"
        ));
    }

    @PutMapping("/places/{placeId}")
    public APIDataResponse<Void> modifyPlace(
            @PathVariable Long placeId,
            @RequestBody PlaceRequest requestBody
    ) {
        return APIDataResponse.empty();
    }

    @DeleteMapping("/places/{placeId}")
    public APIDataResponse<Void> removePlace(@PathVariable Long placeId) {
        return APIDataResponse.empty();
    }

}
