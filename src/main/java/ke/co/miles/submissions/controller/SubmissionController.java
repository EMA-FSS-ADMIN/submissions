/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;
import ke.co.miles.submissions.models.HouseholdData;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

/**
 *
 *
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
@RestController
@RequestMapping("api/v1/household_data")
public class SubmissionController {

    /**
     *
     * @return @throws MalformedURLException
     * @throws ProtocolException
     * @throws IOException
     */
    @GetMapping()
    public Flux<HouseholdData> retrieveHouseholdData() throws MalformedURLException, ProtocolException, IOException {

        URL url = new URL("https://kobo.humanitarianresponse.info/api/v2/assets/aD5ktiL9TmwnQ83tovyvXW/data.json");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("Authorization", "Token 8ba6b71b00354818eebc7384d6c4e4f8a5bc2b26");
        con.setRequestMethod("GET");

        int totalResults = 0;
        int readResults = 0;
        try ( InputStream is = con.getInputStream();  JsonParser parser = Json.createParser(is)) {
            while (parser.hasNext()) {
                Event e = parser.next();
                if (e == Event.KEY_NAME) {
                    switch (parser.getString()) {
                        case "count":

                            // Get the next token
                            e = parser.next();

                            // The next token should be an integral value token
                            // It represents the total count of results 
                            // Use it to initialize the totalResults value
                            if (e == Event.VALUE_NUMBER) {
                                totalResults = parser.getInt();
                            }

                            //If there are no results to process, break the loop
                            if (totalResults == 0) {
                                break;
                            }

                        case "results":

                            //Get the next token
                            e = parser.next();

                            //Continue iff the next token is the start of an array
                            if (e == Event.START_ARRAY) {

                                //Continue iff the array is not empty
                                if (e != Event.END_ARRAY) {

                                    for (int i = 0; i < totalResults; i++) {
                                        
                                        // Move into the object
                                        
                                    
                                        do {

                                        } while (parser.next() != Event.END_OBJECT);
                                    }
                                }

                            }
                            System.out.println(parser.getString());
                            System.out.println("---------");
                            break;
                    }
                }
            }
        }

        return Flux.empty();
    }

    private Object read(Event e) {

        return new Object();
    }

}
