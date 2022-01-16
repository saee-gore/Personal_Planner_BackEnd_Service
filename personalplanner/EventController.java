package com.example.personalplanner;

        import java.net.URI;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

        import com.example.personalplanner.EventParameter;
        import com.example.personalplanner.EventStorage;
@RestController
@RequestMapping(path="/myevents")
public class EventController {
    @Autowired
    private EventStorage customizeddata;
    //http method for getting json format
    @GetMapping(path="/", produces = "application/json")

    public EventParameter getEventList(){
        return customizeddata.getEventList();
    }
    @PostMapping(path="/",consumes = "application/json",produces = "application/json")
    public ResponseEntity<Object> addEvent(@RequestBody EventParameter detail) {
        Integer id = customizeddata.getEventList().getEventParameterList().size() + 1;
        detail.setIndex(id);
        customizeddata.addEvent(detail);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(detail.getIndex()).toUri();
        return ResponseEntity.created(location).build();
    }

}
