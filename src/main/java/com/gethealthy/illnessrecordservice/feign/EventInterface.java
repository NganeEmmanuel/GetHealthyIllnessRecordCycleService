package com.gethealthy.illnessrecordservice.feign;

import com.gethealthy.illnessrecordservice.model.RecordEventsDeleteRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@FeignClient("EVENT-SERVICE")
public interface EventInterface {
    @DeleteMapping("api/v1/events/record/delete-all")
    ResponseEntity<Boolean> deleteAllEventsByRecordID(@RequestBody RecordEventsDeleteRequest deleteRequest);
}
