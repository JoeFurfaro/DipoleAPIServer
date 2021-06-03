class Review {
    Customer customer;
    Product product;
    int stars; // min 1, max 5
    String details;
    Timestamp posted;
}

// NOTE: selector classes must strictly only be database models

class CountStatistic {
    Class<T> selector; // Type of object to query
    Function<T, boolean> predicate; // Criteria for each object to pass

    int count() {
        return [t for t in selector.members() if predicate(t) == true].size();
    }
}

class PercentageStatistic {
    Class<T> selector; // Type of object to query
    Function<T, boolean> selectionPredicate; // Criteria for each object to be considered
    Function<T, boolean> passingPredicate; // Criteria for being in the passing percentage

    double compute() {
        int passing = [t for t in selector.members() if selectionPredicate(t) == true && passingPredicate(t) == true].size();
        int total = [t for t in selector.members() if selectionPredicate(t) == true].size();
        return passing / total;
    }
}

class SumStatisitic {
    Class<T> selector; // Type of object to query
    Function<T, boolean> predicate; // Criteria for each object to be summed
    Function<T, double> valueGetter; // Gets the value to sum from each object

    double compute() {
        return sum([valueGetter(t) for t in selector.members() if predicate(t) == true]);
    }
}

class AverageStatisitic {
    Class<T> selector; // Type of object to query
    Function<T, boolean> predicate; // Criteria for each object to be averaged
    Function<T, double> valueGetter; // Gets the value to average from each object

    double compute() {
        double total = sum([valueGetter(t) for t in selector.members() if predicate(t) == true]);
        double members = [t for t in selector.members() if predicate(t) == true].size();
        return total / members;
    }
}