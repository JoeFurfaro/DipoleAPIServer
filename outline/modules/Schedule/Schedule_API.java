// Gets all days
List<Days> getDays();
// Get days past a timestamp
List<Days> getDaysPast(Date min); // Inclusive
// Get all days in a date range
List<Days> getDaysInRange(Date min, Date max); // Inclusive
// Gets a specific day by ID
Day getDay(int ID);
// Get a specific day by Date
Day getDayByDate(Date date);

// Cancels all orders on a day and disables it
void cancelAndDisableDay(Day day);
// Cancels all orders in an operationshift and disables it
void cancelAndDisableOperationShift(OperationShift shift);
// Cancels all orders in a day
void cancelDay(Day day);
// Cancels all orders in an operation shift
void cancelOperationShift(OperationShift shift);
// Disables a day without cancelling existing orders
void disableDay(Day day);
// Disables an OperationShift without cancelling existing orders
void disableOperationShift(OperationShift shift);

// Create a new day
void addDay(Date date, List<OperationShift> oShifts, List<KitchenShift> kShifts, List<DriverShift> dShifts);
// Edit kitchen shift layout for a day
void editDayKitchenShifts(Day day, List<KitchenShift> newKShifts);
// Delete day, if no orders on that day
void deleteDay(Day day);
// Edit day, if no orders on that day conflict with changes
void editDay(Day day, List<OperationShift> oShifts, List<KitchenShift> kShifts, List<DriverShift> dShifts);
// Returns list of conflicts that arise from proposed changes to a day
List<ChangeConflict> getChangeConflicts(Day day, List<OperationShift> oShifts, List<KitchenShift> kShifts, List<DriverShift> dShifts);
