package com.kyseng.gmall.service;

import com.kyseng.gmall.bean.PmsProductInfo;

import java.util.List;

/**
 * Created by kingcrum on 2020/5/2.
 */
public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);
}
