package stepDefinitions;

import io.cucumber.java.BeforeStep;

import java.io.IOException;


public class Hooks {

    @BeforeStep("@DeletePlace")
    public void beforeScenario() throws IOException {


        StepDefinitions m = new StepDefinitions();

        if (m.place_id == null) {

            m.add_place_payload_with("Lyubo", "Bulgaria", "Asia");
            m.user_calls_with_post_http_request("AddPlaceAPI", "POST");
            m.verify_place_id_created_maps_to_using("Lyubo", "getPlaceAPI");

        }
    }
}
