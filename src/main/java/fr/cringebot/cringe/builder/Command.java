/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Command.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: gchatain <gchatain@student.42lyon.fr>      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/12/05 11:46:21 by gchatain          #+#    #+#             */
/*   Updated: 2021/12/05 13:39:50 by                  ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package fr.cringebot.cringe.builder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * méthode pour parametrer les commandes
 * name = nom de la commande
 * description = description de la commande
 * executortype = personne eligible a l'utilisation de la commande
 * User = utilisateur discord, Console = le terminal du bot.
 */
@Target(value=ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Command {

    String name();

    String description() default "Sans description.";

    ExecutorType type() default ExecutorType.ALL;

    enum ExecutorType{
        ALL, USER, CONSOLE;
    }
}
