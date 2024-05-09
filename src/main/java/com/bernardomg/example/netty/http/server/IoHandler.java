package com.bernardomg.example.netty.http.server;

import java.util.function.BiFunction;

import org.reactivestreams.Publisher;

import reactor.netty.http.server.HttpServerRequest;
import reactor.netty.http.server.HttpServerResponse;

public interface IoHandler extends BiFunction<HttpServerRequest, HttpServerResponse, Publisher<Void>> {

}