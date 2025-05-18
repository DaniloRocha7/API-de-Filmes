package br.com.movieflix.mapper;


import br.com.movieflix.controller.request.StreamingRequest;
import br.com.movieflix.controller.response.StreamingResponse;
import br.com.movieflix.entity.Streaming;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StreamingMapper {
    public static Streaming toStreaming(StreamingRequest request){
        Streaming Streaming = new Streaming();
        return Streaming
                .builder()
                .name(request.name())
                .build();
    }

    public static StreamingResponse toStreaminResponse(Streaming response){
        return StreamingResponse
                .builder()
                .id(response.getId())
                .name(response.getName())
                .build();

    }



}
