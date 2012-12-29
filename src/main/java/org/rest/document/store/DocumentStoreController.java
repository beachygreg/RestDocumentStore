package org.rest.document.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: greg
 * Date: 29/12/12
 * Time: 8:58 AM
 */
@Controller
@RequestMapping("/store")
public class DocumentStoreController {

    @RequestMapping(value="/{key}",method = RequestMethod.POST)
    public void storeDocument(@PathVariable String key){

    }

}
