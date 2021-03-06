package com.shuyu.textutillib.listener

import android.view.View

import com.shuyu.textutillib.model.TopicModel

/**
 * 处理话题的回调
 * Created by shuyu on 2016/11/10.
 */

open interface SpanTopicCallBack {
    fun onClick(view: View, topicModel: TopicModel)
}
