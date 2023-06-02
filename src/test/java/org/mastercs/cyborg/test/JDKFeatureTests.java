package org.mastercs.cyborg.test;

import org.junit.jupiter.api.Test;

public class JDKFeatureTests {

    @Test
    void name() {
        String sql = """
                SELECT
                    users.user_id,
                    users.username,
                    orders.order_id,
                    orders.order_date,
                    products.product_id,
                    products.product_name
                FROM
                    users
                    INNER JOIN orders ON users.user_id = orders.user_id
                    INNER JOIN order_items ON orders.order_id = order_items.order_id
                    INNER JOIN products ON order_items.product_id = products.product_id
                """;
        System.out.println(sql);
    }
}
