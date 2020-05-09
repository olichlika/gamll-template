package com.kyseng.gmall.service;

import com.kyseng.gmall.bean.PmsBaseCatalog1;
import com.kyseng.gmall.bean.PmsBaseCatalog2;
import com.kyseng.gmall.bean.PmsBaseCatalog3;

import java.util.List;

/**
 * Created by kingcrum on 2020/4/26.
 */
public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
