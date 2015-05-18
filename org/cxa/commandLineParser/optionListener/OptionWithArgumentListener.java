/**
 * Copyright 2013 opencxa.org
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
package org.cxa.commandLineParser.optionListener;

/**
 * This class is a listener which is intended for options
 * which take an optional single argument
 * 
 * @author Christopher Armenio
 */
public interface OptionWithArgumentListener<T> extends OptionListener
{
	/**
	 * This function is called whenever the option associated with
	 * this listener is present and successfully parsed.
	 * 
	 * @param argIn the parsed argument if present
	 * 		(or null if not present and marked as optional)
	 */
	public void optionIsPresent(T argIn);
}