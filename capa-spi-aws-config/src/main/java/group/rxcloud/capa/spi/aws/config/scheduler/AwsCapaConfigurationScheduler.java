/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package group.rxcloud.capa.spi.aws.config.scheduler;

import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import static reactor.core.scheduler.Schedulers.DEFAULT_BOUNDED_ELASTIC_QUEUESIZE;
import static reactor.core.scheduler.Schedulers.DEFAULT_BOUNDED_ELASTIC_SIZE;

/**
 * @author Reckless Xu
 */
public enum AwsCapaConfigurationScheduler {

    INSTANCE;

    public final Scheduler configInitScheduler = Schedulers.newBoundedElastic(DEFAULT_BOUNDED_ELASTIC_SIZE, DEFAULT_BOUNDED_ELASTIC_QUEUESIZE,
            "configInitScheduler", 60, true);

    public final Scheduler configSubscribePollingScheduler = Schedulers.newBoundedElastic(DEFAULT_BOUNDED_ELASTIC_SIZE, DEFAULT_BOUNDED_ELASTIC_QUEUESIZE,
            "subscribeConfigScheduler", 60, true);

    public final Scheduler configPublisherScheduler = Schedulers.newBoundedElastic(DEFAULT_BOUNDED_ELASTIC_SIZE, DEFAULT_BOUNDED_ELASTIC_QUEUESIZE,
            "configPublisherScheduler", 60, true);
}