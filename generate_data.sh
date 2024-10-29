generate_data() {
        PARTITION_KEY=$(cat /proc/sys/kernel/random/uuid)
        UUID=$(cat /proc/sys/kernel/random/uuid)
        TYPE=$(echo -e "start\nnavigate\nerror\nfinish" | shuf -n1)
        ACCOUNT=$(echo -e "consumer\npremium\nbusiness" | shuf -n1)
        SOURCE=$(echo -e "mobile\ndesktop\nbrowser" | shuf -n1)
        DATA=$(
                tr -dc A-Za-z0-9 </dev/urandom | head -c 20
                echo ''
        )
        TIMESTAMP=$(date +%s%3N)

        jq -n -n \
                --arg pk "$PARTITION_KEY" \
                --arg dt "$UUID,$TYPE,$ACCOUNT,$SOURCE,$TIMESTAMP" \
                '{partitionKey: $pk, data: $dt }'
}
