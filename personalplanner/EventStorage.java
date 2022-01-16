package com.example.personalplanner;
import org.springframework.stereotype.Repository;
@Repository
public class EventStorage {

    private static EventParameter eventnow = new EventParameter();
    static{
        eventnow.getEventParameterList().add(new EventParameter(1,"10-10-2020","10am PST","Doctor Visit","Visit your doctor in next 10 minutes"));
    }
    public EventParameter getEventList() {
        return eventnow;
    }
    public void addEvent(EventParameter event){
        eventnow.getEventParameterList().add(event);
    }

}