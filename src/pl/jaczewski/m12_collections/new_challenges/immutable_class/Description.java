package pl.jaczewski.m12_collections.new_challenges.immutable_class;

public class Description {
    // CHALLENGE:
    // Make the Location class an Immutable Class.
    //
    // The strategy for creating an Immutable Class is:
    //
    // Steps:
    //  1. Don't provide setters.
    //  2. Make all fields final and private
    //  3. Don't allow the class to be subclassed.
    //  4. If the instance fields include references to mutable objects, don't allow those objects to be changed:
    //      - Don't provide methods that modify the mutable objects.
    //      - Don't share references to the mutable objects.
    //
    // As an added Task, handle the case where exits is null when passed to the constructor.
    //
    // NOTE: Not all classes documented as "immutable" follow these rules.
    // However, the steps above are the basis of an Immutable Class.
    //
    // /*
    //    Edit the code by following the steps in the description
    // */
    //
    // import java.util.HashMap;
    // import java.util.Map;
    //
    // public class Location {
    //    final int locationID;
    //    public String description;
    //    protected Map<String, Integer> exits;
    //
    //    public Location(int locationID, String description, Map<String, Integer> exits) {
    //        this.locationID = locationID;
    //        this.description = description;
    //        this.exits = new HashMap<String, Integer>(exits);
    //        this.exits.put("Q", 0);
    //    }
    //
    //    public void addExit(String direction, int location) {
    //        exits.put(direction, location);
    //    }
    //
    //    public void setLocationID(int locationID) {
    //        this.locationID = locationID;
    //    }
    //
    //    public int getLocationID() {
    //        return locationID;
    //    }
    //
    //    public void setDescription(String description) {
    //        this.description = description;
    //    }
    //
    //    public String getDescription() {
    //        return description;
    //    }
    //
    //    public void setExits(Map<String, Integer> exits) {
    //        this.exits = exits;
    //    }
    //
    //    public Map<String, Integer> getExits() {
    //        return exits;
    //    }
    //
    //}
}
