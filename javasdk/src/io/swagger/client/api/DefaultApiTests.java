package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Machine;
import junit.framework.TestCase;

import java.util.List;

/**
 * Created by berty on 6/8/15.
 */
public class DefaultApiTests extends TestCase {
    public void testGetMachine() {
        DefaultApi api = new DefaultApi();
        api.setBasePath("http://10.32.254.121:8080");

        List<Machine> machines = null;
        try {
            machines = api.machinesGet();
        } catch (ApiException e) {
            e.printStackTrace();
        }

        assertNotNull(machines);
        assertTrue(machines.size() > 0);
    }

    public void testLogin() {
        DefaultApi api = new DefaultApi();
        api.setBasePath("http://10.32.254.121:8080");

        boolean ok = false;
        try {
            api.loginGet();
            ok = true;
        } catch (ApiException e) {
            e.printStackTrace();
            assertTrue(false);
            ok = false;
        }
        assertTrue(ok);

    }
}
