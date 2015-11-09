
package sample;

import org.apache.felix.ipojo.annotations.Requires;
import org.wisdom.api.DefaultController;
import org.wisdom.api.annotations.Body;
import org.wisdom.api.annotations.Controller;
import org.wisdom.api.annotations.Route;
import org.wisdom.api.annotations.View;
import org.wisdom.api.content.Json;
import org.wisdom.api.http.HttpMethod;
import org.wisdom.api.http.Result;
import org.wisdom.api.templates.Template;

/**
 * Your first Second Controller.
 */
@Controller
public class FormController extends DefaultController {

    @Requires
    Json json;

    @View("form")
    Template form;

    /**
     * The action method returning the welcome page. It handles
     * HTTP GET request on the "/" URL.
     *
     * @return the form page
     */
    @Route(method = HttpMethod.GET, uri = "/form")
    public Result welcome() {
        System.err.println("GET");
        return ok(render(form));
    }

    @Route(method = HttpMethod.POST, uri = "/form")
    public Result updateTodo(@Body Data data) {
        System.err.println("POST");
        System.err.println("data: " + data);
        return ok(render(form, "data", json.toJson(data)));
    }

}
