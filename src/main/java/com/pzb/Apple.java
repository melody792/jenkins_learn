/* ****************************************************************** */
/*                                                                    */
/* IBM Confidential                                                   */
/*                                                                    */
/* OCO Source Materials                                               */
/* 5900-A1H                                                           */
/* © Copyright IBM Corp. 2019                                         */
/*                                                                    */
/* The source code for this program is not published or otherwise     */
/* divested of its trade secrets, irrespective of what has been       */
/* deposited with the U.S. Copyright Office.                          */
/*                                                                    */
/* ****************************************************************** */
package com.pzb;

import org.apache.commons.collections.list.GrowthList;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.zjsonpatch.DiffFlags;
import com.flipkart.zjsonpatch.JsonDiff;
import com.flipkart.zjsonpatch.JsonPatch;
/**
 * create by pzhbao on 23/04/2019
 */
public class Apple {
    private final String name;

    public Apple(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
}
