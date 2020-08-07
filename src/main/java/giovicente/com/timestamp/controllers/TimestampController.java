package giovicente.com.timestamp.controllers;

import giovicente.com.timestamp.models.MainframeTimestamp;
import giovicente.com.timestamp.services.TimestampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timestamp")
public class TimestampController {

    @Autowired
    private TimestampService timestampService;

    @GetMapping
    public MainframeTimestamp getTimestamp() { return timestampService.gerarTimestamp(); }

}
