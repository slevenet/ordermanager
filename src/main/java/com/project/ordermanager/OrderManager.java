package com.project.ordermanager;

import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.*;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
/*
import org.json.simple.JSONValue;
import org.json.simple.JSONObject;

@Component
public class OrderManager {

    @EventListener(ContextRefreshedEvent.class)
    public void tt(){
        System.out.println("test");
    }
    public void test () throws IOException {

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        try {

            // Set these variables to whatever personal ones are preferred
            String domain = "https://stream-fxpractice.oanda.com";
            String access_token = "42358b5440b084e5a6ff8ec540e3b998-65eed9e2dca8ffe6b3b7008dcb4f4781";
            String account_id = "101-004-9452424-001";
            String instruments = "EUR_USD";


            HttpUriRequest httpGet = new HttpGet(domain + "/v3/accounts/" + account_id + "/pricing/stream/?instruments=" + instruments);
            httpGet.setHeader(new BasicHeader("Authorization", "Bearer " + access_token));

            System.out.println("Executing request: " + httpGet.getRequestLine());

            HttpResponse resp = httpClient.execute(httpGet);
            HttpEntity entity = resp.getEntity();

            if (resp.getStatusLine().getStatusCode() == 200 && entity != null) {
                InputStream stream = entity.getContent();
                String line;
                BufferedReader br = new BufferedReader(new InputStreamReader(stream));

                while ((line = br.readLine()) != null) {

                    Object obj = JSONValue.parse(line);
                    JSONObject tick = (JSONObject) obj;
                 //   JSONObject t = (JSONObject)tick.get("");
                    // unwrap if necessary
                    if (tick.containsKey("tick")) {
                        tick = (JSONObject) tick.get("tick");
                    }

                    // ignore heartbeats
                    if (tick.containsKey("instrument")) {
                        System.out.println("-------");

                        String instrument = tick.get("instrument").toString();
                        String time = tick.get("time").toString();
                        String bid;
                        String ask;
                        if(tick.get("bids")!=null) {
                            bid = tick.get("bids").toString();
                            System.out.println(bid);
                        }
                        if(tick.get("asks")!=null) {
                            ask = tick.get("asks").toString();
                            System.out.println(ask);
                        }

                        System.out.println(instrument);
                        System.out.println(time);
                        //  System.out.println(tick);
                    }
                }
            } else {
                // print error message
                String responseString = EntityUtils.toString(entity, "UTF-8");
                System.out.println(responseString);
            }

        } finally {
            httpClient.close();
        }
    }
}
*/