/*
 * This file is part of NavalPlan
 *
 * Copyright (C) 2009 Fundación para o Fomento da Calidade Industrial e
 *                    Desenvolvemento Tecnolóxico de Galicia
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.navalplanner.web.planner.order;

import org.navalplanner.business.orders.entities.Order;
import org.navalplanner.business.planner.entities.TaskElement;

/**
 * This interface allows to go to the schedule and the details of an
 * {@link Order}.
 *
 * @author Óscar González Fernández <ogonzalez@igalia.com>
 */
public interface IOrderPlanningGate {

    void goToTaskResourceAllocation(Order order, TaskElement task);

    void goToScheduleOf(Order order);

    void goToOrderDetails(Order order);

}
