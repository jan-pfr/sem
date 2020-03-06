
# USE CASE: 6 View an employee's details for promotion request

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want *to view and employee's details* so that *the employee's promotion request can be supported*.

### Scope

Company.

### Level

Primary task.

### Preconditions

We now the employee to view the details from.  Database contains current employee salary data.

### Success End Condition

The employee's details can be viewed and employee has been promoted.

### Failed End Condition

Employee's details could not be viewed and employee not promoted.

### Primary Actor

HR Advisor.

### Trigger

A request for viewing an employee's details to support promotion is sent.

## MAIN SUCCESS SCENARIO

1. Company requests HR to promote employee.
2. HR advisor captures the name of the employee to view the details from.
3. HR advisor views the details of the given employee.
4. HR advisor promotes employee.

## EXTENSIONS

3. **Employee does not exits**:
    1. HR advisor informs about that employee does not exist.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0