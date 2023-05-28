package com.newbee.mall.controller;

import com.newbee.mall.entity.SaleGoods;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Administrator
 * @Date 2023/5/25 10:41
 **/
@RestController
public class TestController {

    @RequestMapping("/type/conversion")
    public void typeConversionTest(String goodsName, float weight, int type, Boolean onSale) {
        System.out.println("goodsName:" + goodsName);
        System.out.println("weight:" + weight);
        System.out.println("type:" + type);
        System.out.println("onSale:" + onSale);
    }

    @RequestMapping(value = "/test/httpmessageconverter", method = RequestMethod.POST)
    public SaleGoods httpMessageConverterTest(@RequestBody SaleGoods saleGoods) {
        System.out.println(saleGoods.toString());
        saleGoods.setType(saleGoods.getType() + 1);
        saleGoods.setGoodsName("商品名称：" + saleGoods.getGoodsName());
        return saleGoods;
    }
}
