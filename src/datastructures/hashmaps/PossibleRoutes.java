package datastructures.hashmaps;
import java.util.*;
/*
You are given the following unordered list of source and destination airports for a set of routes. Find the path through the airports and output.
Input:
SFO → JFK
PER → SYD
SYD → SFO
JFK → LHR
Output:
PER → SYD → SFO → JFK → LHR
source_to_destination = {
        "SFO": "JFK",
        "PER": "SYD",
        "SYD": "SFO",
        "JFK": "LHR"
        }
*/

public class PossibleRoutes {

     HashMap<String,String> routes;

    public PossibleRoutes() {
        routes = new HashMap<>();
        routes.put("SFO","JFK");
        routes.put("PER","SYD");
        routes.put("SYD","SFO");
        routes.put("JFK","LHR");
    }

    public String route(String origin, String destiny){
        String route = origin + " ";
        while (!origin.equals(destiny)){
                route += routes.get(origin) + " ";
                origin = routes.get(origin);
        }
        return route;
    }

    public static void main(String[] args) {
        PossibleRoutes possibleRoutes = new PossibleRoutes();
        System.out.println(possibleRoutes.route("PER", "LHR"));
    }
}
