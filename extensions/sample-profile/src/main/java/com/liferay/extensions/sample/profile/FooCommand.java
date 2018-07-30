/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liferay.extensions.sample.profile;

import com.liferay.blade.cli.command.BaseCommand;

/**
 * @author Liferay
 */
public class FooCommand extends BaseCommand<FooArgs> {

	@Override
	public void execute() throws Exception {
		FooArgs args = getArgs();

		getBladeCLI().out("FooCommand says " + args.getData());
	}

	@Override
	public Class<FooArgs> getArgsClass() {
		return FooArgs.class;
	}

}