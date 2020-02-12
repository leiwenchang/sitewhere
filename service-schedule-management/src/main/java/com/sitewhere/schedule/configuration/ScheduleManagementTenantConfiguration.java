/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.schedule.configuration;

import com.sitewhere.datastore.DatastoreDefinition;
import com.sitewhere.spi.microservice.multitenant.ITenantEngineConfiguration;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Maps schedule management tenant engine YAML configuration to objects.
 */
@RegisterForReflection
public class ScheduleManagementTenantConfiguration implements ITenantEngineConfiguration {

    /** Datastore definition */
    private DatastoreDefinition datastore;

    public DatastoreDefinition getDatastore() {
	return datastore;
    }

    public void setDatastore(DatastoreDefinition datastore) {
	this.datastore = datastore;
    }
}