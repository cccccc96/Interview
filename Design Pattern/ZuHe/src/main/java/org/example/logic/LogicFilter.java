package org.example.logic;

import org.example.model.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author czh
 * @description
 */
public interface LogicFilter {
    /**
     * 计算下一个子节点
     * @param info
     * @param treeNodeLinkList
     * @return 下一个子节点
     */
    Long filter(Map<String,String> info, List<TreeNodeLink> treeNodeLinkList);

}
