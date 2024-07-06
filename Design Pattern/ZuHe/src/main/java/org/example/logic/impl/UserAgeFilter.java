package org.example.logic.impl;


import org.example.logic.BaseLogic;
import org.example.model.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author czh
 * @description
 */
public class UserAgeFilter extends BaseLogic {
    @Override
    public Long filter(Map<String, String> info, List<TreeNodeLink> treeNodeLinkList) {
        String myinfo = info.get("age");
        System.out.println(myinfo);
        for(TreeNodeLink treeNodeLink:treeNodeLinkList){
            if(decisionLogic(myinfo,treeNodeLink)){
                return treeNodeLink.getNodeIdTo();
            }
        }
        return 0L;
    }
}
