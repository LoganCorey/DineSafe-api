package com.toronto.dinesafe;

import com.google.common.base.Joiner;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Controller for all the establishments in the dinesafe db
 */
@RestController
@RequestMapping("/establishment")
@Api(value = "EstablishmentControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class EstablishmentController {
    private final EstablishmentRepository repository;


    EstablishmentController(EstablishmentRepository repository){
        this.repository = repository;
    }

    /*@GetMapping("/")
    @ApiOperation("Gets all establishments")
    @ApiResponses(value= {@ApiResponse(code=200,message="OK", response = Establishment.class)})
    List<Establishment> all(){
        return (List<Establishment>) repository.findAll();
    }*/
    @RequestMapping(method = RequestMethod.GET, value = "/")
    @ResponseBody
    public List<Establishment> findAllBySpecification(@RequestParam(value = "search") String search) {
        EstablishmentSpecificationsBuilder builder = new EstablishmentSpecificationsBuilder();
        String operationSetExper = Joiner.on("|")
                .join(SearchOperation.SIMPLE_OPERATION_SET);
        Pattern pattern = Pattern.compile("(\\w+?)(" + operationSetExper + ")(\\p{Punct}?)(\\w+?)(\\p{Punct}?),");
        Matcher matcher = pattern.matcher(search + ",");
        while (matcher.find()) {
            builder.with(matcher.group(1), matcher.group(2), matcher.group(4), matcher.group(3), matcher.group(5));
        }

        Specification<Establishment> spec = builder.build();
        return repository.findAll(spec);
    }

    @GetMapping("/{id}")
    @ApiOperation("Get an establishment with specific id")
    @ApiResponses(value= {@ApiResponse(code=200,message="OK", response = Establishment.class)})
    @ExceptionHandler(EstablishmentNotFoundException.class)
    Establishment one(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(()-> new EstablishmentNotFoundException(id));
    }





}
