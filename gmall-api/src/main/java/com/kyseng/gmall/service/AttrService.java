package com.kyseng.gmall.service;

import com.kyseng.gmall.bean.PmsBaseAttrInfo;
import com.kyseng.gmall.bean.PmsBaseAttrValue;
import com.kyseng.gmall.bean.PmsBaseSaleAttr;

import java.util.List;

/**
 * Created by kingcrum on 2020/4/29.
 */
public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
