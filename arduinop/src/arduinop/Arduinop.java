
package arduinop;

import blazing.Blazing;
import blazing.BlazingResponse;
import blazing.Post;
import blazing.WebServer;

@WebServer("8082")
public class Arduinop {


    public static void main(String[] args) {
        Blazing.createServer(Arduinop.class);
        
    }
    
    
    public static void DisplayTable(BlazingResponse response){
        String message = """
                         HELLO                 
                         """;
        
        
        response.sendResponse(message);
        
    }
}
