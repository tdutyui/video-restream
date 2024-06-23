package org.example.videorestream.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class StreamController {

    @RequestMapping("/live")
    fun stream() =
        Mono.just("<html><body><video width='1920' height='1080' controls autoplay><source src='http://localhost:8080/hls/stream.m3u8' type='application/vnd.apple.mpegurl'></video></body></html>")
}
