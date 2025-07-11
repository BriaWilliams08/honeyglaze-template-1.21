package com.honeyglaze.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent GRAPE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).build();
}
