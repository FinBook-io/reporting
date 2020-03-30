package io.finbook.http;

import io.finbook.spark.ResponseCreator;

public class MyResponse {

    public static ResponseCreator ok(String body) {
        return (req, res) -> {
            res.status(200);
            res.type("application/json");
            return body;
        };
    }

    public static ResponseCreator badRequest(String body) {
        return (req, res) -> {
            res.status(400);
            res.type("application/json");
            return body;
        };
    }

    // more methods creating responses
}
