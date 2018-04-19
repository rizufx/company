package com.qinsol.insbot.nbapp.controller;

import com.qinsol.insbo.commons.QuoteDto;
import com.qinsol.insbot.nbapp.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fahmida on 4/11/2018.
 */
@RestController
@RequestMapping("/newbusiness")
public class NewBusinessController {

    @Autowired
    QuoteService quoteService;

    @PostMapping("/quote")
    public QuoteDto getQuote(@RequestBody QuoteDto quote) throws Exception{

        return quoteService.getQuote(quote);

    }

}
