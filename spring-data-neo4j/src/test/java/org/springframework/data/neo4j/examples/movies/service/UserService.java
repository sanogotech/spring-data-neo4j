/*
 * Copyright 2011-2019 the original author or authors.
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
package org.springframework.data.neo4j.examples.movies.service;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.UseBookmark;
import org.springframework.data.neo4j.examples.movies.domain.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Michal Bachman
 */
public interface UserService {

	@Transactional
	void updateUser(User user, String newName);

	@Transactional
	void notInterestedIn(Long userId, Long genreId);

	@Transactional
	void saveWithTxAnnotationOnInterface(User user);

	void saveWithTxAnnotationOnImpl(User user);

	@UseBookmark
	@Transactional
	Collection<User> getAllUsersWithBookmark();
}
