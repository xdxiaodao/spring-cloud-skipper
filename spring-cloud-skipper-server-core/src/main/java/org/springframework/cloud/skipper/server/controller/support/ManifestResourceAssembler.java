/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.skipper.server.controller.support;

import org.springframework.cloud.skipper.domain.Manifest;
import org.springframework.cloud.skipper.server.controller.ReleaseController;
import org.springframework.hateoas.EntityModel;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

/**
 * @author Mark Pollack
 */
public class ManifestResourceAssembler extends SimpleResourceAssembler<Manifest> {

	@Override
	protected void addLinks(EntityModel<Manifest> resource) {
		super.addLinks(resource);
		resource.add(linkTo(methodOn(ReleaseController.class).status(null)).withRel("status"));
	}
}
