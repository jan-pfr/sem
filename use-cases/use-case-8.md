
# USE CASE: 8 Delete Details of Employee

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want *to delete an employee's details* so that *the company is compliant with data retention legislation*.

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the employee.  Database contains employee.

### Success End Condition

Details of Employee are deleted from the system.

### Failed End Condition

Details of Employee are not deleted.

### Primary Actor

HR Advisor.

### Trigger

Employee leaves the company and want its details to be removed.
Employee requests HR to delete details.

## MAIN SUCCESS SCENARIO

1. HR receives request on deleting the employee's details.
2. HR advisor deletes details of requesting employee.
3. HR confirms deletion of details to employee. 

## EXTENSIONS

3. **Employee does not exist**:
    1. HR advisor informs company employee does not exist.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0