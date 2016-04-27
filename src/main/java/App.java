import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get ("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/rectangles", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      int length = Integer.parseInt(request.queryParams("length"));
      int width = Integer.parseInt(request.queryParams("width"));

      Rectangles myRectangles = new Rectangles(length, width);
      model.put("myRectangles", myRectangles);

      if (myRectangles.isSquare()) {
        Cube myCube = new Cube(myRectangles);
        model.put("myCube", myCube);
      }

      model.put("template", "templates/rectangles.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
