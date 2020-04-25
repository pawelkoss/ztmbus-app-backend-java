package com.example.umwarszawaapp.api.umwarszawa;



import com.example.umwarszawaapp.domain.TimeTable.TimeTableFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timetable")
@RequiredArgsConstructor
class TimeTableController {

    private final TimeTableFacade timeTableFacade;



}
