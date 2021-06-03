// Represents a calendar day of operation
class Day {}

// Period of serving a menu, cannot overlap
class OperationShift {}

// Driver staft shift, cannot overlap, must fill all OperationShifts
class DriverShift {}

// Kitchen staff shift, can overlap, some arrangement must fill all OperationShifts
class KitchenShift {}

// A conflict that arises from attempting to edit the structor of an existing day
class ChangeConflict {}