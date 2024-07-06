package org.example.engine;

import org.example.model.TreeRich;

import java.util.Map;

/**
 * @author czh
 * @description
 */
public interface IEngine {
    String process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> info);
}
