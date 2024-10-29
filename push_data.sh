export API_URL="https://62utph3sb0.execute-api.us-west-2.amazonaws.com/lab"

while :; do
        for i in $(seq 1 10); do
                JSON_DATA=$(generate_data)
                curl --write-out "\n" \
                        --request POST \
                        --header 'Content-Type: application/json' \
                        --data "$JSON_DATA" \
                        "$API_URL/record"
        done
        sleep 10
done
