package com.example.personalplanner;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class EventParameter {
    private List<EventParameter> eventParameterList;
    private Integer index;
    private String current_event;
    private String current_date;
    private String current_time;
    private String current_taskdescription;
    public EventParameter(){}
    public EventParameter(Integer index, String current_date,String current_time,String current_event, String current_taskdescription){
        super();
        this.index = index;
        this.current_date = current_date;
        this.current_time=current_time;
        this.current_event = current_event;
        this.current_taskdescription = current_taskdescription;
    }
    //retrieve data
    public List<EventParameter> getEventParameterList(){
        if(eventParameterList==null){eventParameterList=new ArrayList<EventParameter>();}
        return eventParameterList;
    }
    //adding event
    public void setEventParameterList(List<EventParameter> event){
        this.eventParameterList=event;
    }
    //getters n setters
    public Integer getIndex(){return index;}
    public void setIndex(Integer index){this.index=index;}
    public String getCurrent_date(){return current_date;}
    public void setCurrent_date(String current_date){this.current_date=current_date;}
    public String getCurrent_time(){return current_time;}
    public void setCurrent_time(String current_date){this.current_time=current_time;}
    public String getCurrent_event(){return current_event;}
    public void setCurrent_event(String date){this.current_event=current_event;}
    public String getCurrent_taskdescription(){return current_taskdescription;}
    public void setCurrent_taskdescription(String current_taskdescription){this.current_taskdescription=current_taskdescription;}
}