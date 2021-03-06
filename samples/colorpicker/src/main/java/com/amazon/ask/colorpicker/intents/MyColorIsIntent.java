/*
    Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
    except in compliance with the License. A copy of the License is located at

        http://aws.amazon.com/apache2.0/

    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
    the specific language governing permissions and limitations under the License.
 */

package com.amazon.ask.colorpicker.intents;

import com.amazon.ask.colorpicker.slots.ListOfColors;
import com.amazon.ask.interaction.annotation.data.SlotProperty;
import com.amazon.ask.interaction.annotation.data.IntentResource;
import com.amazon.ask.interaction.annotation.type.Intent;

@Intent("MyColorIsIntent")
@IntentResource("my_color_is_intent")
public class MyColorIsIntent {

    @SlotProperty
    private ListOfColors color;

    public ListOfColors getColor() {
        return this.color;
    }

    public void setColor(ListOfColors Color) {
        this.color = Color;
    }
}
