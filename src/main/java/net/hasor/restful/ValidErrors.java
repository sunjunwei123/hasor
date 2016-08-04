/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.restful;
import org.more.bizcommon.Message;

import java.util.List;
/**
 * 添加验证错误消息。
 * @version : 2014年8月27日
 * @author 赵永春(zyc@hasor.net)
 */
public interface ValidErrors {
    /**添加验证失败的消息。*/
    public void addError(String key, String validString);

    /**添加验证失败的消息。*/
    public void addError(String key, Message validMessage);

    /**添加验证失败的消息。*/
    public void addErrors(String key, List<Message> validMessage);
}