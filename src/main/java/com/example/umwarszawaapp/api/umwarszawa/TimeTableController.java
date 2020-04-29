package com.example.umwarszawaapp.api.umwarszawa;



import com.example.umwarszawaapp.domain.TimeTable.TimeTableFacade;
import com.example.umwarszawaapp.domain.TimeTable.TimeTableLineResultDTO;
import com.example.umwarszawaapp.domain.TimeTable.TimeTableResultDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1")
@RestController
@RequestMapping("/timetable")
@RequiredArgsConstructor
class TimeTableController {

    private final TimeTableFacade timeTableFacade;

    @GetMapping(path = "/{setof}/{pistill}")
    @ResponseStatus(HttpStatus.CREATED)
    public TimeTableLineResultDTO getTimeTableLines(@PathVariable String setof, @PathVariable String pistill){

        TimeTableLineResultDTO timeTableLineResultDTO = timeTableFacade.getTimeTableLines(setof, pistill);

        return timeTableLineResultDTO;
    }


    @GetMapping(path = "/{setof}/{pistill}/{line}")
    @ResponseStatus(HttpStatus.CREATED)
    public TimeTableResultDTO getTimeTable(@PathVariable String setof, @PathVariable String pistill, @PathVariable String line){

        TimeTableResultDTO timeTableResultDTO = timeTableFacade.getTimeTable(setof, pistill, line);

        return timeTableResultDTO;
    }





}
