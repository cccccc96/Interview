package org.example.engine;

import org.example.logic.LogicFilter;
import org.example.model.TreeNode;
import org.example.model.TreeRich;
import org.example.model.TreeRoot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author czh
 * @description
 */
public class TreeEngineHandle extends EngineConfig implements IEngine{
    private Logger logger = LoggerFactory.getLogger(TreeEngineHandle.class);
    @Override
    public String process(Long treeId, String userId, TreeRich treeRich, Map<String, String> info) {
        TreeRoot root = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();

        Long treeNodeId = root.getTreeRootNodeId();
        TreeNode node = treeNodeMap.get(treeNodeId);

        while(node.getNodeType().equals(1)){
            String ruleKey = node.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            Long nextNode = logicFilter.filter(info, node.getTreeNodeLinkList());
            node = treeNodeMap.get(nextNode);
            logger.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", root.getTreeName(), userId, treeId, node.getTreeNodeId(), ruleKey);
        }
        return userId+treeId.toString()+node.getTreeNodeId().toString()+node.getNodeValue().toString();

    }
}
