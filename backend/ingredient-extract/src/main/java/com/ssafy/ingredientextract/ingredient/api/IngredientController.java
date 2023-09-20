package com.ssafy.ingredientextract.ingredient.api;

import com.fasterxml.jackson.annotation.JsonView;
import com.ssafy.ingredientextract.ingredient.api.Request.TextListRequest;
import com.ssafy.ingredientextract.ingredient.api.Response.Response;
import com.ssafy.ingredientextract.ingredient.api.Response.ResponseViews;
import com.ssafy.ingredientextract.ingredient.db.Ingredient;
import com.ssafy.ingredientextract.ingredient.dto.IngredientInfoDto;
import com.ssafy.ingredientextract.ingredient.service.IngredientService;
import com.ssafy.ingredientextract.ingredient.service.IngredientServiceImpl;
import com.ssafy.ingredientextract.trie.Trie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("")
public class IngredientController {
    @Autowired
    private Trie trie;

    @Autowired
    private IngredientServiceImpl ingredientService;

    @JsonView(ResponseViews.NoRequest.class)
    @PostMapping("/ingredient-extract")
    public ResponseEntity<Response> ingredientExtract(@RequestBody TextListRequest request){
        List<String> textList = request.getTextList();

        StringBuilder sb = new StringBuilder();
        for(String text : textList){
            sb.append(text);
        }
        String concat = sb.toString();
        Set<Short> s = trie.ahoCorasick(concat);

        List<String> ingredients = new ArrayList<String>();
        for(Short idx : s){
            ingredients.add(trie.getIngredient(idx));
        }

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("data", ingredients);

        Response response = Response
                .builder()
                .message("OK")
                .data(data)
                .build();
        return ResponseEntity.ok(response);
    }

    @JsonView(ResponseViews.NoRequest.class)
    @PostMapping("/ingredient-extract/{ingredientName}")
    public ResponseEntity<Response> addIngredient(@PathVariable String ingredientName){

        Ingredient ingredient = ingredientService.addIngredient(ingredientName);

        IngredientInfoDto infos = IngredientInfoDto
                .builder()
                .ingredientId(ingredient.getIngredientInfoId())
                .ingredientName(ingredient.getIngredientInfoName())
                .build();

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("data", infos);

        Response response = Response
                .builder()
                .message("OK")
                .data(data)
                .build();
        return ResponseEntity.ok(response);
    }
}
